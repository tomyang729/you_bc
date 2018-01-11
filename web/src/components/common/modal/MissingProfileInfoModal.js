import React from 'react';
import PropTypes from 'prop-types';
import {Dialog, IconButton, RaisedButton} from "material-ui";
import CloseIcon from 'material-ui/svg-icons/navigation/close';
import "./MissingProfileInfoModal.less";
import {PRIMARY_GREEN, PRIMARY_WHITE} from "../../../styles/constants/colors";
import {Link} from "react-router-dom";
import {TO_PROFILE} from "../../../constants/api";

const closeIconStyle = {
    position: 'absolute',
    top: 12,
    right: 8
};

const MissingProfileInfoModal = (props) => {
    return (
        <Dialog
            open={props.openModal}
            style={{top: '-6vh'}}
            actionsContainerClassName="survey-complete-modal-buttons"
            actions={[
                <RaisedButton
                    onClick={props.onClose}
                    backgroundColor={PRIMARY_GREEN}
                    label="稍后再说"
                    labelColor={PRIMARY_WHITE}
                />,
                <Link to={TO_PROFILE}>
                    <RaisedButton
                        backgroundColor={PRIMARY_GREEN}
                        label="去填写"
                        labelColor={PRIMARY_WHITE}
                    />
                </Link>
            ]}
        >
            <IconButton onClick={props.onClose} style={closeIconStyle}>
                <CloseIcon/>
            </IconButton>
            <p className="survey-complete-modal-text">{props.content}</p>
        </Dialog>
    );
};

MissingProfileInfoModal.propTypes = {
    openModal: PropTypes.bool.isRequired,
    onClose: PropTypes.func.isRequired,
    content: PropTypes.string.isRequired,
};

export default MissingProfileInfoModal;
