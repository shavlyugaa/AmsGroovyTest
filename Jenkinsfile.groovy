node {
 
    // Mark the code checkout 'Checkout'....
    stage 'Checkout'
 
    // // Get some code from a GitHub repository
    //checkout scm

    // Set environment variables
    stage "Setenv"
    // build parameters
   parameterDefinitions  : [
              [name         : 'APP'],
              [name         : 'ENVIRONMENT',
               defaultValue : 'staging'
              
               $class       : 'StringParameterDefinition'],
              [name         : 'PACKER']
      ]
    
    
    env.APP = APP
    //env.ENVIRONMENT = ENVIRONMENT
    env.PACKER = PACKER
    
    echo env.APP
    echo env.ENVIRONMENT
    echo env.PACKER
}