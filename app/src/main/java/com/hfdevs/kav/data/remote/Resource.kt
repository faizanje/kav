package com.hfdevs.kav.data.remote


sealed class Resource<T>(
    val data: T? = null,
    val message: String? = null,
) {
    class Success<T>(data: T) : Resource<T>(data)
    class Error<T>(message: String, data: T? = null) : Resource<T>(data, message)
    class Loading<T> : Resource<T>()
}

fun <T> Resource<T>.isLoading(block: () -> Unit): Resource<T> {
    if (this is Resource.Loading) {
        block.invoke()
    }
    return this
}

fun <T> Resource<T>.isSuccess(block: (data: T) -> Unit): Resource<T> {
    if (this is Resource.Success) {
        block(this.data!!)
    }
    return this
}

fun <T> Resource<T>.isError(block: (message: String) -> Unit): Resource<T> {
    if (this is Resource.Error) {
        block(this.message!!)
    }
    return this
}