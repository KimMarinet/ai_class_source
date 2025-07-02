import styled, {css} from "styled-components";

const commonStyle = css`
    border: 0;  
    background: ${({ bg }) => bg ?? 'black'};
    color: ${({color}) => color ?? 'white'};
    ${({ border }) => border && css`
        border: 3px solid #000;
    `}
`;

const SmallButton = styled.button`
    min-width: 80px;
    height: 50px;
    ${commonStyle}
`;

const MediumButton = styled.button`
    min-width: 150px;
    height: 95px;
    ${commonStyle}
`;

export { SmallButton, MediumButton }