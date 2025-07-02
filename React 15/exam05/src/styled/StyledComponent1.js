import styled from "styled-components";
import { SmallButton, MediumButton } from "../global/components/Buttons";

const StyledComponent1 = () => {
    return (
        <div>
            <SmallButton color="blue" bg="orange" border={true}>클릭</SmallButton>
        </div>
    );
};

export default StyledComponent1;