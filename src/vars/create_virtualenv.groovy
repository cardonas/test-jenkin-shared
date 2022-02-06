def call(){
    sh """
        #!/bin/bash
        python -m pip install -U pip
        python -m pip install -U virtualenv
        python -m virtualenv .venv
        PATH=$PATH:$WORKSPACE/.venv/bin
        . $WORKSPACE/.venv/bin/activate
        python -m pip install -r requirements.txt
    """
}