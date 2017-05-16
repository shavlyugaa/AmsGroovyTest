node ('lli-node') {
 
    // Mark the code checkout 'Checkout'....
    stage 'Checkout'
 
    // // Get some code from a GitHub repository
    //checkout scm

    // Set environment variables
    stage "Setenv"
    // build parameters
    properties properties: [[
      $class                : 'ParametersDefinitionProperty',
      parameterDefinitions  : [
              [name         : 'APP',               
               $class       : 'StringParameterDefinition'],
              [name         : 'ENVIRONMENT',
               defaultValue : 'staging',               
               $class       : 'StringParameterDefinition'],
              [name         : 'PACKER',              
               $class       : 'StringParameterDefinition']
      ]
    ]]
    
    
    env.APP = APP
    env.ENVIRONMENT = ENVIRONMENT
    env.PACKER = PACKER
    
    echo env.APP
    echo env.ENVIRONMENT
    echo env.PACKER
}