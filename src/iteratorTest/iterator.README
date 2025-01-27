# Iterator 패턴

Iterator 패턴

- for문의 i++하면서 순차대로 검색하게 된다. 여기에서 사용되는 변수 i의 기능을 추상화하여 일반화한 것을 디자인 패턴에서 Iterator 패턴이라고 한다.
- 무언가 많이 모여있을 때 순서대로 가리키며 검색과 처리를 반복하는 것이다. 그래서 iterator를 반복자라고도 한다.

Iterable<E> 인터페이스

- Java.lang패키지에 선언되어있다.
- 이 인터페이스를 구현하는 클래스는 집합체가 된다.
- Iterator<E> iterator(): 메서드가 선언되어있고 집합체에 대응하는 Iterator<E>를 만들기 위한 것이다.

Iterator<E> 클래스

- hasNext(): 다음요소가 존재하는 지 알려주는 메서드
- Next(): 다음 요소를 가져오는 메서드 그리고 다음 요소를 반환할 수 있도록 내부 상태를 다음으로 진행시켜 놓는 역할

> [패턴의 등장인물]
> **Iterator(반복자)**: 요소를 순서대로 검색하는 API를 결정한다. hasNext, next메서드를 결정
> **ConcreteIterator(구체적인 반복자)**: Iterator가 결정한 API를 실제로 구현한다. 검색에 필요한 정보를 담고 있어야한다.
> **Aggregate(집합체)**: Iterator를 만들어 내는 API를 결정한다. 이 API는 가진 요소를 차례로 검색해주는 사람을 만들어 내는 메서드다.
> **ConcreteAggregate(구체적인 집합체)**: Aggregate가 결정한 API를 실제로 구현한다.

어떻게 구현하든 Iterator를 사용할 수 있다.

- 왜 집합체 외부에 Iterator같은 것을 만들어야할까? for문을 사용하면 편할것 같은데..
- 가장 큰 이유는 Iterator를 사용함으로써 구현과 분리하여 반복가능하다.
- Iterator삭제는 필요없다. → 가비지 컬렉터가 자동으로 해줌