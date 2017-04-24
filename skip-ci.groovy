#!groovy

Boolean shouldSkip() {
    sh(script: 'git log --pretty=oneline', returnStdout: true)
        .split('\n')
        .any { it =~/(?i)\[skip\s+ci\]/ } 
}
