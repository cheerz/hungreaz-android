package com.cheerz.casadelrestau.login.singIn

interface SignIn {

    interface View {
        fun signInNotValid()
    }

    interface Presenter {
        fun onSignUpClicked()
        fun onSignInClicked(email: String, password : String)

    }

    interface Model {

    }

    interface Listener {
        fun onSignUpClicked()
    }
}