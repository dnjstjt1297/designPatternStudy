# Abstract Factory 패턴

Abstract Factory

- 추상적인 공장은 추상적인 부품을 조립하여 추상적인 제품을 만든다.
- 객체지향에서 추상적이란 구체적으로 어떻게 구현되어 있는지 생각하지 않고 API에만 주목하는 상태를 말한다. 즉 API만 사용해 부품을 조립하고 제품으로 완성하는 것이다.

패턴의 등장인물

- AbstractProduct역:  추상적인 부품이나 제품의 API를 결정한다.
- AbstractFactory역: AbstractProduct의 인스턴스를 만들기 위한API를 결정한다.
- Client역: AbstractFactory나 AbstractProduct의 API만을 사용해 작업한다.
- ConcreteProduct역: AbstractProduct역의 API를 구현한다.
- ConcreteFactory역: AbstractFactory역의 API를 구현한다.

패턴 사용이유

- 공장을 추가하는 것은 쉽다.
- 하지만 부품을 새로 추가하면 이미 존재하는 공장 전체를 수정해야하므로 부품을 추가하는 것은 어렵다.