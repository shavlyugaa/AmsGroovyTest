node {
 
    // Mark the code checkout 'Checkout'....
    stage 'Checkout'
 
    // // Get some code from a GitHub repository
    //checkout scm

    // Set environment variables
    stage "Setenv"
    // build parameters
   parameterDefinitions  : [
              [name         : 'APP',
               defaultValue : 'amsws',
               description  : 'Which app to deploy (amsws / amsadm / amsroams)',
               $class       : 'StringParameterDefinition'],
              [name         : 'ENVIRONMENT',
               defaultValue : 'staging',
               description  : 'Which environment to deploy in (prod / staging)',
               $class       : 'StringParameterDefinition'],
              [name         : 'PACKER',
               defaultValue : 'no',
               description  : 'Run Packer or not? (yes / no)',
               $class       : 'StringParameterDefinition']
      ]
    
    
    env.APP = APP
    //env.ENVIRONMENT = ENVIRONMENT
    env.PACKER = PACKER
    
    echo env.APP
    echo env.ENVIRONMENT
    echo env.PACKER
}