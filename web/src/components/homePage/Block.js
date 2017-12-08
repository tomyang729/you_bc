'use strict';
/**
 * It's a Link wrapper that will be used in index page
 */

// libs
import React, {Component} from 'react'
import { Link } from "react-router-dom";
import PropTypes from 'prop-types';
//styles
import './Block.less';
import {CLASSMATES, FRIENDS, ROOMMATES} from "../../constants/api";

const Block = (props) => {
    let blockClass = 'index-page-block --' + props.type;
    return (
        <Link to={props.path}>
            <div className={blockClass}>
                {props.displayName}
            </div>
        </Link>
    );
};

Block.propTypes = {
    type: PropTypes.string.isRequired,
    path: PropTypes.oneOf([CLASSMATES, FRIENDS, ROOMMATES]).isRequired,
    displayName: PropTypes.string.isRequired,
};

export default Block;