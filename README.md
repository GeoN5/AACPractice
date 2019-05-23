# AACPractice
Android Architecture Component - ViewModel + LiveData + DataBinding

## 1: DataBinding만 사용 
>화면 rotate시 데이터 초기화 발생 -> ViewModel사용
>
>ViewModel 생성후에 화면 rotate 시에 날아가는 데이터들을 보관
>
>ViewModel LifeCycle Activity가 Destroy될 때 없어지기 때문에 저장해놓으면 계속 사용 가능
<img src="https://developer.android.com/images/topic/libraries/architecture/viewmodel-lifecycle.png">


## 2: ViewModel 적용 
>화면 rotate시 데이터가 날아가지 않음
>
> \+ LiveData랑 같이 쓰면 관찰(observe) 가능한 데이터를 만들수 있다.
>
>변경 가능: MutableLiveData 변경 불가능: LiveData
>
>LiveData의 장점 : 관찰할 수 있다(observe), 데이터가 변경됬을때 ui를 쉽게 바꿀 수 있다.

## 3~4: LiveData 적용 with DataBinding
>observe method를 통한 view 관찰과 갱신
>
>\+ DataBinding이랑 ViewModel이랑 엮으면 더 간단해진다.
>
>xml에 바로 ViewModel의 LiveData를 꽂아 넣을수있다.

## etc
```kotlin
binding.lifecycleOwner = this//Activity의 lifecycle을 참조하면서 알아서 뷰갱신
```
```kotlin
binding.setViewModel = //variable에 지정한 name의 method로 이루어진다.
```
