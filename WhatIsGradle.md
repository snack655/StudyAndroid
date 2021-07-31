## 그래들 이해하기!

안드로이드 앱을 실행하거나 앱 스토어에 올릴 때는

__소스 파일이나 리소스 파일을 빌드하거나 배포하는__

__작업__ 이 필요하다.

 </br>

이때 사용되는 것이 __그래들(Gradle)__ 입니다.

 </br>

__그래들은 안드로이드 스튜디오에서 사용하는 빌드 및 배포 도구!__

 </br>

그래들 파일은 프로젝트 수준과 모듈 수준으로 나눠 관리하기 때문에

새로운 프로젝트를 만들면 두 개의 build.gradle 파일이 생긴다.

 </br>

새프로젝트를 열어보자!

그리고 Gradle Scripts를 펼쳐서

build.gradle(Project: ... ) 파일을 열자!

 </br>

__이 파일은 프로젝트 안에 들어있는 모든 모듈에 적용되는 설정을 담고 있다.__

가끔 외부 도구를 포함시키기 위해 buildscript의 dependencies 안에 

classpath를 추가하는 정도의 수정만 있을 수 있다.

 </br>

__다음은 모듈 수준의 그래들 설정 파일이다.__

파일의 이름은 __build.gradle (Module: app)__ 이다!

 </br>

이 파일은 위에서 말했 듯이 

__각각의 모듈에 대한 설정을 담고 있다.__

 </br>

프로젝트가 만들어지면 app 모듈은 기본으로 만들어지는데,

이 파일이 app 모듈의 설정 정보를 담고 있는 것이다.

먄약 새로운 모듈을 추가하면

그 모듈에 대한 build.gradle 파일도 새로 추가된다.

__이 파일에는 빌드에 필요한 중요한 정보들이 들어 있다.__

 </br>

모듈 정보에 대해서 살펴보자!

 </br>

__applicationId는 이 앱의 id 값이다.__

id 값은 전 세계에서 유일한 값으로 설정되어야 한다.

 </br>

__compileSdkVersion은 빌드를 진행할 때 어떤 버전의 SDK를__

__사용할 것인지를 지정한다.__

보통 최신 버전의 SDK 버전을 지정하게 된다.

 </br>

__minSdkVersion은 이 앱이 어떤 하위 버전까지 지원하도록 할 것인지를 지정한다.__

최신 기능을 하위 단말에서 지원하지 못하는 경우에는 

앱에서 사용하는 기능을 지원하기 시작한 버전을 minSdkVersion으로 지정한다.

 </br>

__targetSdkVersion은 이 앱이 검증된 버전이 어떤 SDK 버전인지를 지정한다.__

만약 새로운 SDK가 출시되었다고 하더라도 해당 SDK에서 검증되지

않은 앱은 이 버전을 이전 버전으로 지정할 수도 있다.

 </br>

__dependencies에는 외부 라이브러리를 추가할 수 있다.__

inplementation으로 시작하는 한 줄은 직접 추가한 외부 라이브러리이다.

 </br>

마지막으로

__settings.graddle 파일에는 어떤 모듈을 포함할 것인지에__

__대한 정보가 들어 있다.__

include ':app'

이 내용은 안드로이드 스튜디오에서 어떻게 설정하는가에 따라

자동으로 변경될 수 있다.

 </br>

__이 외에 local.properties 파일 안에는 현재 사용하고 있는__

__PC에 설치된 SDK의 위치가 기록되어 있으며__

 </br>

__gradle.properties 파일 안에는 메모리 설정이 들어있다.__

 </br>

그리고 __gradle-wrapper.properties 파일에는 그래들 버전 정보 등이__

__들어 있는데,__ 이런 정보들은 안드로이드 스튜디오에서 자동 설정하는

경우가 많아 굳이 기억하지 않아도 된다.