## hellomvn

A java maven project to show how to debug java with VSCode on Win10.


### Prerequisites

- vscode-1.60.1 with pulgins:

  - markdown All in one
  - java extension pack

- jdk-11.0.12_windows-x64_bin.zip

- maven-3.3.3+

- msys2 (optional)

    Enable msys2 shell color output:

    Add the following lines at the end of '~/.bashrc' in mingw shell:

    ```bash
    alias ls='ls -hF --color=tty'
    alias dir='ls --color=auto --format=vertical'
    alias vdir='ls --color=auto --format=long'
    alias ll='ls -l'
    alias la='ls -A'
    alias l='ls -CF'
    ```

### Project settings

Architecture of project as below:

    .
    ├── pom.xml  
    ├── README.md
    ├── .vscode
        ├── launch.json
        ├── settings.json
        └── tasks.json

Set "terminal.integrated.defaultProfile.windows" in settings.json if you want to use another shell, e.g.:

    "terminal.integrated.defaultProfile.windows": "PowerShell"

### Debug Java

Open windows command prompt and navigate to project folder, type the following command to launch VSCode and load project:

    C:\Users\$USER\Workspace\hellomvn> code .

Open App.java in VSCode, place a break point on the first line of main() function, then Press F5 to debug. The break point will be hit on.
