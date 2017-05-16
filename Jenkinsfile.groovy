node {
 
    // Mark the code checkout 'Checkout'....
    stage 'Checkout'
 
    // // Get some code from a GitHub repository
    //checkout scm

    // Set environment variables
    stage "Setenv"
    // build parameters
   //parameterDefinitions  : [
   //           [name         : 'APP']
   //           [name         : 'PACKER']
   //   ]
    
    
    env.APP = APP
    env.PACKER = PACKER
    
    echo env.APP
    echo env.ENVIRONMENT
    echo env.PACKER
}