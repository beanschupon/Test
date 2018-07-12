#!groovy

def deployEnv = "${env.ENVIRONMENT}";
echo "Deploying to Environment: ${deployEnv}"