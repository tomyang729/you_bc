'use strict';

// libs
import React from 'react';
import PropTypes from 'prop-types';
// icons
import EditIcon from 'material-ui/svg-icons/editor/mode-edit';
import ClassIcon from 'material-ui/svg-icons/av/library-books';
import HomeIcon from 'material-ui/svg-icons/action/home';
import SprayIcon from 'material-ui/svg-icons/action/favorite-border';
import AccountIcon from 'material-ui/svg-icons/action/account-circle'
// components
import PokeCard from './PokeCard';
import InfoRow from '../InfoRow';
import List from 'material-ui/List/List';
import IconButton from 'material-ui/IconButton';
// constants
import {CLASSMATES, FRIENDS, ROOMMATES, PERSONAL} from '../../../constants/api';

// styling
import './ProfileCard.less';

const LeftCornerIcon = (props) => {
    let icon = null;
    let style = {color: 'white', width: 18, height: 18};
    switch (props.type) {
        case CLASSMATES:
            icon = <ClassIcon style={style}/>;
            break;
        case FRIENDS:
            icon = <SprayIcon style={style}/>;
            break;
        case ROOMMATES:
            icon = <HomeIcon style={style}/>;
            break;
        case PERSONAL:
            icon = <AccountIcon style={style}/>;
            break;
        default:
            icon = <SprayIcon style={style}/>;
    }
    let classname = `profile-card-left-corner --${props.type}`;
    return (
        <span className={classname}>
            {icon}
        </span>
    );
};

const ProfileCard = (props) => {
    return (
        <PokeCard
            leftCorner={<LeftCornerIcon type={props.type}/>}
            rightCorner={<IconButton onClick={props.onClickEdit}><EditIcon style={{color: 'grey'}}/></IconButton>}
        >
            <div className="profile-card-list-wrapper">
                <List className="profile-card-list">
                    {props.contentList.map((content, index) => (
                        <InfoRow
                            key={index}
                            className="profile-card-list-item"
                            leftElement={content.leftElement}
                            rightElement={content.rightElement}
                        />
                    ))}
                </List>
            </div>
        </PokeCard>
    );
};

ProfileCard.propTypes = {
    type: PropTypes.oneOf([CLASSMATES, FRIENDS, ROOMMATES, PERSONAL]),
    contentList: PropTypes.arrayOf(
        PropTypes.shape({
            leftElement: PropTypes.element,
            rightElement: PropTypes.element
        })
    ).isRequired,
    onClickEdit: PropTypes.func.isRequired
};

export default ProfileCard;
