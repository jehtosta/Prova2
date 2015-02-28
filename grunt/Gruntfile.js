
module.exports = function(grunt) {
  var utils;
  utils = (require('./gruntcomponents/misc/commonutils'))(grunt);
  
  grunt.task.loadTasks('gruntcomponents/tasks');
  grunt.task.loadNpmTasks('grunt-contrib-watch');
  grunt.task.loadNpmTasks('grunt-contrib-less');
  //grunt.task.loadNpmTasks('grunt-contrib-compass');
   
  grunt.loadNpmTasks('grunt-contrib-compass');
  //grunt.loadNpmTasks('grunt-compass-compiler');

  grunt.loadNpmTasks('grunt-contrib-sass');
  
  grunt.initConfig({
    distdir: '../src/main/webapp/resources/tema',
    pkg: grunt.file.readJSON('package.json'),

    growl: {
      ok: {
        title: 'COMPLETE!!',
        msg: '＼(^o^)／'
      }
    },

    coffee: {
      compile: {
        dir: '<%=distdir%>/js/coffee',
        dest: '<%=distdir%>/js/site'
      }
    },

    less: {
      theme: {
        options : { yuicompress: true },
        src: '<%=distdir%>/sass/style.less',
        dest: '<%=distdir%>/css/styleall.css'
      }, 
      styleIpad: {
        // options : { yuicompress: true },
        src:  '<%=distdir%>/css/sass/style-768.less', 
        dest: '<%=distdir%>/css/style-768.css'
      }, 
      style980: {
        // options : { yuicompress: true },
        src:  '<%=distdir%>/css/sass/style-980.less', 
        dest: '<%=distdir%>/css/style-980.css'
      } 
       
    },


    compass: {
       layoutScss: {
        
        
        options: {
        
          sassDir: '<%=distdir%>/scss',
          cssDir: '<%=distdir%>/css/site' 
          
        } 
 
      }
    }, 

    sass: {
      layoutSass: {
        src:  '<%=distdir%>/sass/style.sass',
        dest: '<%=distdir%>/css/styleFromSass.css'
      }
    }, 

 

    watch: {
      coffee: {
        files: '<%=distdir%>/js/**/*.coffee',
        tasks: ['coffee', 'growl:ok']
      },  
      less: {
        files: ['<%=distdir%>/css/**/*.less', '<%=distdir%>/sass/**/*.less' ],
        tasks: 'less'
      }, 

      compass: {
        files: ['<%=distdir%>/scss/**/*.scss', '**/*.scss'],
        tasks: ['compass']
      }, 

      sass: {
        files: ['<%=distdir%>/sass/**/*.sass' ],
        tasks: ['sass'] 
      }

    }
  });
  grunt.event.on('coffee.error', function(msg) {
    return utils.growl('ERROR!!', msg);
  });




  return grunt.registerTask('default', ['coffee', 'less', 'compass', 'sass', 'growl:ok']);


};
