'use strict';
// libs
import React from 'react'
import PropTypes from 'prop-types';
import BackArrow from 'material-ui/svg-icons/hardware/keyboard-arrow-left';
import IconButton from 'material-ui/IconButton';
import {PRIMARY_WHITE} from "../../styles/constants/colors";
import "./NavHeader.less";
import "../../styles/constants/fonts.less";
import "../../styles/constants/icon.less";

class NavHeader extends React.Component {
    constructor(props) {
        super(props);
        this.goBack = this.goBack.bind(this);
    }

    goBack() {
        console.log('going back!');
    }

    render() {
        return (
            <div className={'nav-header'} style={{backgroundColor: this.props.color}}>
                <span className={"left-action"}>
                    <IconButton onClick={this.goBack}
                                className={"common-icon-button"}
                    >
                        <BackArrow color={PRIMARY_WHITE} className={"common-icon"} />
                    </IconButton>
                </span>
                <span className={"common-font"} style={{color: PRIMARY_WHITE}}>
                    {this.props.title}
                </span>
                <span className={"right-action"}>
                    <IconButton className={"common-icon-button"}>
                        {this.props.iconRight}
                    </IconButton>
                </span>
            </div>
        );
    }
}

NavHeader.propTypes = {
    title: PropTypes.string.isRequired,
    iconRight: PropTypes.element,
    color: PropTypes.string.isRequired
};
export default NavHeader;