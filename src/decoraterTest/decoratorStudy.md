# Decorator 패턴

Decorator

- 객체에 장식을 더해가는 디자인 패턴이다.

패턴의 등장인물

- Component: 기능을 추가할 때 핵심이 되는 역할이다.
- ConcreteComponent: Component의 API를 구현하는 역할
- Decorator: Component와 동일한 API를 가지며 이 Decorator가 장식할 대상이 되는 Component도 가지고 있다.
- ConcreteDecorator: 구체적인 Decorator이다.

패턴 사용이유

- 장식들과 내용물을 동일시한다. 장식들을 사용해 내용물을 감싸도 API는 가려지지 않는다. 이것을 API가 투과적이라고 한다.
- 내용물을 바꾸지 않고 기능을 추가할 수 있다. Decorator들은 위임을 사용하지만 수정하지 않는다.
- 동적으로 기능을 추가할 수 있다.
- 단순한 구성이어도 다양한 기능을 추가할 수 있다.