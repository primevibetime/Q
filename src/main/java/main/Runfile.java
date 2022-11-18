package main;

import com.github.tomaslanger.chalk.Chalk;
import org.jetbrains.annotations.NotNull;
import qlang.core.internal.CompilerFileTree;
import qlang.core.internal.Environment;
import qlang.core.internal.Parser;
import qlang.core.internal.Scope;
import qlang.core.lang.NativeFunctionLoader;
import qlang.core.lang.Q.QFile;
import qlang.core.lang.Util;
import qlang.core.lang.Visitor;
import qlang.runtime.errors.Problem;

import java.io.*;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

/*
    Main file, run this to execute the 'Main.q' file
 */

public class Runfile {

    public static QFile mainFile;

    public static void main(String @NotNull [] args) {

        Environment.args = args;

        NativeFunctionLoader nfl = new NativeFunctionLoader();

        nfl.registerNatives();

        // Not in use right now, as it is currently non-functioning.
        if (args.length >= 103945809) {
            Util.eqcli(args);
        } else {

            Scope baseScope = new Scope(null, false);
            Visitor globalScope = new Visitor(baseScope, new HashMap<>());
            Environment env = new Environment();
            String fpath = "src/main/QFiles/Main.q";

            if (args.length >= 1) {
                if (args.length == 1 && !args[0].startsWith("-")) {
                    fpath = args[0];
                } else if (args[0].equals("--env") || args[0].equals("-e")) {
                    System.out.println(Environment.global);
                    System.exit(0);
                } else if (args[0].equals("--run") || args[0].equals("-r")) {
                    if (args.length == 1) {
                        System.out.println(Chalk.on("No QFile provided! Try this, `q --run <file>.q`").bgBlue());
                        System.exit(0);
                    } else {
                        fpath = args[1];
                    }
                } else if (args[0].equals("--runblind") || args[0].equals("-rb")) {

                    if (args.length == 1) {
                        System.out.println(Chalk.on("No QFile provided! Try this, `q --runblind <file>.q`").bgBlue());
                        System.exit(0);
                    }

                    Parser p = new Parser();
                    p.setFile(new File(args[1]));
                    try {
                        p.parse();
                    } catch (IOException e) {
                        throw new Problem(e);
                    }
                    System.exit(0);
                } else if (args[0].equals("--help") || args[0].equals("-h")) {
                    System.out.println("""
                            Flags:
                            --env (-e) | Print the environment
                            --runblind <file> (-rb <file>) | Run the file given with no security checks
                            --run <file> (-r <file>) | Run a file. Same as `q <file>.q`
                            --info (-i) | Returns Q version, host, build, dir, and more.
                            --killall (-ka) | Kills Q processes.
                            --terminal (-t) | Allows you to enter your code in the terminal directly, rather than a file.
                            --help (-h) | Returns this menu.
                            --version (-v) | Get the Q version. Good for checking installation status.
                            --interact (-in) | interact with the Q CLI
                            """);
                    System.exit(0);
                } else if (args[0].equals("-i") || args[0].equals("--info")) {
                    try {
                        System.out.printf("""
                                Version: %s
                                Build: %s
                                Host: %s
                                QJar Directory: %s
                                Running: %s
                                Size: %s
                                %n""", Environment.global.qversion, Environment.global, System.getProperty("user.dir"), System.getProperty("user.home") + "/.q/", false, (java.nio.file.Files.size(new File(System.getProperty("user.home") + "/.q/" + "Q.jar").toPath()) / 1000000) + "mb");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    System.exit(0);
                } else if (args[0].equals("--killall") || args[0].equals("-ka")) {
                    System.out.println("System permission: denied. Run `killall -9 java` to kill all processes.");
                    System.exit(0);
                } else if (args[0].equals("--terminal") || args[0].equals("-t")) {
                    StringBuilder total = new StringBuilder();
                    String input = "";

                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                    while (!Objects.equals(input, "\n")) {
                        try {
                            input = reader.readLine();
                            total.append(input);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    Parser par = new Parser().fromText(total.toString());
                    try {
                        par.parse();
                    } catch (IOException e) {
                        e.printStackTrace();
                        //throw new Problem(e);
                    }
                } else if (args[0].equals("-v") || args[0].equals("--version")) {
                    System.out.printf("""
                            Version: %s
                            Installation status: \u2705\n
                            """, Environment.global.qversion);
                    System.exit(0);
                } else if (args[0].equals("--interact") || args[0].equals("-in")) {
                    System.out.println("Q build: "
                            + Runfile.class.hashCode()
                            + "\nShell version: "
                            + Environment.global.shver
                            + "\n`h` or `help` for help page, `q` or `quit` to exit the interactive shell\n");
                    while (true) {
                        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                        try {
                            System.out.print("\n>> ");
                            String total = reader.readLine();
                            System.out.println();

                            String ary[] = new String[1];

                            if (total.contains(" ")) {
                                ary = total.split(" ");
                            } else {
                                ary[0] = total;
                            }

                            for (int i = 0; i < ary.length; i++) {
                                // ????????
                                // work please
                                int nint = i;
                                nint++;
                                String next;
                                String nextnext;
                                try {
                                    next = ary[nint];
                                } catch (Exception e) {
                                    next = "";
                                }
                                try {
                                    nextnext = ary[nint++];
                                } catch (Exception e) {
                                    nextnext = "";
                                }
                                switch (ary[i]) {

                                    case "q", "quit" -> System.exit(0);
                                    case "env" -> System.out.println("Env: " + Environment.global);
                                    case "h" -> {
                                        System.out.println("Q Help Menu:\n");
                                        System.out.println("""
                                                q/quit: quit q interactive
                                                env: Q Environment
                                                diag: Sys Diag
                                                sinfo [-j, --java] [-q, --q]: System Info
                                                sysloc: System location
                                                github [-p, --public]: Github Repo return value
                                                uscript [-m, --makefile] [-p, --print]: update script permanent
                                                readme [-p, --public]: GH README permalink
                                                cls: Clear console
                                                """);
                                    }
                                    case "diag" -> {
                                        System.out.println(Environment.global.hasMainExecuted + " < Has Main Executed?");
                                        System.out.println(Environment.global.allLibs + " < All Libraries");
                                        System.out.println(Environment.global.allowedLibs + " < Allowed Libs");
                                        System.out.println(Environment.global.lst + " < Lst");
                                        System.out.println(Environment.global.objs + " < Objs");
                                        System.out.println(Environment.global.natives + " < Natives");
                                        System.out.println(Environment.global.response + " < Resp");
                                        System.out.println(Environment.global.classes + " < Classes");
                                        System.out.println(Environment.global.consts + " < Consts");
                                        System.out.println(Environment.global.files + " < Files");
                                        System.out.println(Environment.global.functions + " < Funcs");
                                        System.out.println(Environment.global.jTextAreaMap + " < JTAMap");
                                        System.out.println(Environment.global.namespaces + " < Namespaces");
                                        System.out.println(Environment.global.nativeJava + " < NativeJava");
                                        System.out.println(Environment.global.nativeNames + " < NativeNames");
                                        System.out.println(Environment.global.parsed + " < Parsed");
                                        System.out.println(Environment.global.scope + " < Global Scope");
                                        System.out.println(Environment.global.visitor + " < Global Visitor");
                                        System.out.println(Environment.global.webs + " < Webs");
                                        System.out.println(Environment.global.wins + " < Wins");
                                        System.out.println(Environment.global + " < Global value");
                                    }
                                    case "sinfo" -> {
                                        if (next.equals("-j") || next.equals("--java")) {
                                            System.out.println(
                                                    "ANTLR Version: 4.10.1" +
                                                            "\nQ build: "
                                                            + Runfile.class.hashCode()
                                                            + "Java version: " + System.getProperty("java.version")
                                                            + "\nJRuntime: " + System.getProperty("java.runtime.version") + "\n"
                                                            + "");
                                        } else if (next.equals("-q") || next.equals("--q")) {
                                            System.out.println(
                                                            "\nQ Version: " + Environment.global.qversion
                                                            + "Q System Location: " + System.getProperty("user.home") + "/.q/"
                                                            + "Q Shell version: " + Environment.global.shver
                                                            + "Installation status: perfect :)\n"
                                                            + "");
                                        } else {
                                            System.out.println(
                                                    "ANTLR Version: 4.10.1\nQ build version: "
                                                            + Runfile.class.hashCode()
                                                            + "\nQ Version: " + Environment.global.qversion
                                                            + "Q System Location: " + System.getProperty("user.home") + "/.q/"
                                                            + "Q Shell version: " + Environment.global.shver
                                                            + "Installation status: perfect :)\n"
                                                            + "Java version: " + System.getProperty("java.version")
                                                            + "\nJRuntime: " + System.getProperty("java.runtime.version") + "\n"
                                                            + "");
                                        }
                                    }
                                    case "filetree" ->
                                            System.out.println(new CompilerFileTree().tree(new File("src/main/java/").toPath()).get());
                                    case "sysloc" -> System.out.println(System.getProperty("user.home") + "/.q/");
                                    case "github" -> {
                                        if (next.equals("-p") || next.equals("--public")) {
                                            System.out.println("https://github.com/QRX53/Q-public");
                                        } else {
                                            System.out.println("https://github.com/QRX53/Q");
                                        }
                                    }
                                    case "uscript" -> {
                                        if (next.equals("--makefile") || next.equals("-m")) {
                                            File newf;
                                            
                                            if (!nextnext.equals("")) {
                                                newf = new File(nextnext);
                                            } else {
                                                newf = new File("install.sh");
                                            }

                                            if (!newf.exists()) {
                                                newf.createNewFile();
                                            }

                                            FileWriter fw = new FileWriter(newf);
                                            fw.write(Util.updateScript);
                                            fw.close();

                                        } else if (next.equals("-p") || next.equals("--print")) {
                                            System.out.println(Util.updateScript);
                                        } else {
                                            System.out.println(Chalk.on("'uscript' Usage:\nuscript [-p] [--print] [-m someFile] [--makefile someFile]\n").bgRed());
                                        }
                                    }
                                    case "readme" -> {
                                        if (next.equals("-p") || next.equals("--public")) {
                                            System.out.println(Chalk.on("https://github.com/QRX53/q-public#this-is-the-public-version-of-the-language-so-that-i-dont-have-to-sign-in-on-github-every-time-because-the-personal-access-token-thing-is-stupid-this-wont-be-updated-as-often-only-when-i-need-a-public-copy").bgYellow());
                                        } else {
                                            System.out.println(Chalk.on("https://github.com/QRX53/Q#readme").bgYellow());
                                        }
                                    }
                                    case "cls" ->
                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                    default -> {
                                        continue;
                                    }
                                }

                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }

                } else if (args[0].equals("--update") || args[0].equals("-u")) {
                    int percent = 0;
                    String cmd = "/bin/bash -c \"$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)\" ; brew install git ; brew install mvn ; brew install node ; brew install npm ; npm install wipeclean -g ; git clone http://github.com/qRX53/Q/ ; brew install cloc ; cloc Q ; cd Q ; mvn clean compile assembly:single ; brew install trash ; sudo trash ~/.q/Q.jar ; cd target ; ls ; mv Q-1.0-jar-with-dependencies.jar ~/ ; cd ; ls ; sudo mkdir -p .q ; sudo mv Q-1.0-jar-with-dependencies.jar ~/.q/Q.jar ; cd .q ; ls ; cd ; trash Q ; wipeclean ; echo Success!";

                    String[] cmds = cmd.split(" ; ");

                    for (String x : cmds) {
                        try {
                            String result;
                            Process p = Runtime.getRuntime().exec(x);
                            InputStream inputStream = p.getInputStream();
                            Scanner s = new Scanner(inputStream).useDelimiter("\\A");
                            result = s.hasNext() ? s.next() : null;
                            p.waitFor();
                            System.out.println(result);
                            if (!(percent >= 100)) {
                                percent += 5;
                            }

                            if (percent == 60) {
                                System.out.println("Updating... 60% complete. Please allow extra time.");
                                continue;
                            }

                            System.out.println("Updating... " + percent + "% done.");
                        } catch (Exception e) {
                            throw new Problem(e);
                        }
                    }

                    Util.execute(cmd);
                    System.exit(0);

                } else if (args[0].startsWith("-")) {
                    System.out.println("Flag not recognized '" + args[0] + "'. Run q --help for more.");
                    System.exit(0);
                }
            } else {
                System.out.printf("Q version %s: \u2705\n", Environment.global.qversion);
                System.out.println("\n\nTo run a file, execute: `q <file>.q`, or enter `q --help` for assistance.");
                System.exit(0);
            }

            mainFile = new QFile(globalScope, env, fpath, new Parser());
            mainFile.execute();
        }
    }
}
