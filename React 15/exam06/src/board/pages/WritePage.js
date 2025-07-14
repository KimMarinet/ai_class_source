import React, { useState, Suspense } from 'react';
import loadable from '@loadable/component';

const SplitMe = loadable(() => import('./SplitMe'), {fallback: <div>로딩 중...</div>});

const WritePage = () => {
    const [visivle, setVisible] = useState(false);

    return (
        <>
          <button type='button' onClick={() => setVisible(true)}>보이기</button>
          {visivle && <SplitMe />}
        </>
    );
}

/*
const SplitMe = React.lazy(() => import('./SplitMe'));

const WritePage = () => {
  const [visivle, setVisible] = useState(false);

  return (
      <>
        <h1>글 작성...</h1>;
        <button type='button' onClick={() => setVisible(true)}>보이기</button>
        <Suspense fallback={<div>로딩 중...</div>}>{visivle && <SplitMe />}</Suspense> 
      </>// 지연 실행할 녀석은 Suspense 내부에 넣어줄 것!
  );
};*/

export default React.memo(WritePage);
