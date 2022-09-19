package com.hfdevs.kav.data.remote

class ResponseHandling<T> private constructor(
    val status: Status,
    val data: T?,
    val message: String?
) {
    enum class Status {
        SUCCESS, ERROR, LOADING
    }

    companion object {
        fun <T> success(data: T?): ResponseHandling<T> {
            return ResponseHandling(Status.SUCCESS, data, "Success")
        }

        fun <T> error(msg: String?, data: T?): ResponseHandling<T> {
            return ResponseHandling(Status.ERROR, data, msg)
        }

        fun <T> loading(data: T?): ResponseHandling<T> {
            return ResponseHandling(Status.LOADING, data, "Loading")
        }
    }
}