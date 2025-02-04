# Composite 패턴

Composite

- 디렉터리는 재귀적인 구조를 만들어낸다.
- Composite 패턴은 이러한 구조를 만들기 위한 패턴이다. 그릇과 내용물을 동일시하여 재귀적인 구조를 만든다.

패턴의 등장인물

- Leaf역: 내용물을 나타낸다.
- Composite역: 그릇을 나타내며 Leaf역이나 Composite역을 넣을 수있다.
- Component역: Leaf와 Composite를 동일시하기 위한 것이다.
- Client역: Composite 패턴의 사용자다.