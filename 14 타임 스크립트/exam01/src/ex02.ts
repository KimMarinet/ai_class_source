let employeeName: string = '김문수'

const fruits: string[] = [];
fruits.push('사과')
fruits.pop()

const fruits2: (string | number)[] = [];

// 배열 - 자료형의 갯수와 순서를 고정 (튜플)
const fruits3: [string, number] = ['사과', 1]

// 객체 타입
type userType = {
    name: String
    age: number
    address?: string // ? -> 있어도 되고 없어도 되고 (옵셔널 체이닝)
}

const user: userType = {
    name: '김문수',
    age: 40
}