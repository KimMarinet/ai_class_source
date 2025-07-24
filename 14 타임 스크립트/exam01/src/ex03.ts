type UserType = {
    email: string
    password?: string
    name: string
}

type AddressType = {
    zonecode: string
}

const user01: UserType & AddressType = {
    // & 타입을 결합해서 (필수 타입은 정의 필수)
    email: 'user01@test.org',
    name: "사용자01",
    zonecode: '0000'
}