import styles from './CSSModule.module.css'

const CSSModule = () => {
    return(
        <div className={`${styles.wrapper}`}>
            hello, It's me <span className="something">Mario</span>
        </div>
    );
};

export default CSSModule;