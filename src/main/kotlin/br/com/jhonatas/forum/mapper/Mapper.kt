package br.com.jhonatas.forum.mapper

interface Mapper<T, U> {

    fun mapper(t: T): U

}
