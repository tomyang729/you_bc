'use strict';
// libs
import React, {Component} from 'react'
import { Route, Switch} from 'react-router-dom'
// components
import NotFound from '../components/errorPage/NotFound'
import AuthFacade from "./AuthFacade";
import ProfileContainer from './ProfileContainer'
import MainListContainer from "./MainListContainer";
// constants
import {
    DISLIKE_CLASSMATES_API, DISLIKE_FRIENDS_API, DISLIKE_ROOMMATES_API,
    FETCH_CLASSMATES_API, FETCH_FRIENDS_API, FETCH_ROOMMATES_API, LIKE_CLASSMATES_API, LIKE_FRIENDS_API,
    LIKE_ROOMMATES_API,
    TO_CLASSMATES, TO_FRIENDS, TO_PROFILE, TO_ROOMMATES
} from "../constants/api";
import DemoContainer from "../components/DemoContainer";
import {
    PRIMARY_BLUE, PRIMARY_RED, PRIMARY_YELLOW, SECONDARY_BLUE, SECONDARY_RED,
    SECONDARY_YELLOW
} from "../styles/constants/colors";
import RollingEmoji from "../components/common/RollingEmoji";

const ClassmateContainer = () => (
    <MainListContainer
        fetchAPI={FETCH_CLASSMATES_API}
        dislikeAPI={DISLIKE_CLASSMATES_API}
        likeAPI={LIKE_CLASSMATES_API}
        title="找课友"
        themeColor={PRIMARY_RED}
        subThemeColor={SECONDARY_RED}
    />
);

const RoommateContainer = () => (
    <MainListContainer
        fetchAPI={FETCH_ROOMMATES_API}
        dislikeAPI={DISLIKE_ROOMMATES_API}
        likeAPI={LIKE_ROOMMATES_API}
        title="找室友"
        themeColor={PRIMARY_BLUE}
        subThemeColor={SECONDARY_BLUE}
    />
);

const FriendContainer = () => (
    <MainListContainer
        fetchAPI={FETCH_FRIENDS_API}
        dislikeAPI={DISLIKE_FRIENDS_API}
        likeAPI={LIKE_FRIENDS_API}
        title={<RollingEmoji rollableStyle={{margin: "5px 0 0"}} iconSize={30} rollingInterval={1500} />}
        themeColor={PRIMARY_YELLOW}
        subThemeColor={SECONDARY_YELLOW}
    />
);

class App extends Component {
    render() {
        return (
            <Switch>
                <Route exact path='/' component={AuthFacade}/>
                <Route path={TO_CLASSMATES} render={ClassmateContainer}/>
                <Route path={TO_FRIENDS} render={FriendContainer}/>
                <Route path={TO_ROOMMATES} render={RoommateContainer}/>
                <Route path={TO_PROFILE} component={ProfileContainer}/>
                <Route path='/demo' component={DemoContainer}/>
                <Route component={NotFound}/>
            </Switch>
        );
    }
}

export default App;