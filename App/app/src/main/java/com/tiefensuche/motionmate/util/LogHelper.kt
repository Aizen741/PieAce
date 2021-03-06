/*
 * SPDX-License-Identifier: GPL-3.0-only
 */
package com.tiefensuche.motionmate.util

import android.util.Log

import com.tiefensuche.motionmate.BuildConfig

internal object LogHelper {

    private const val LOG_PREFIX = "mm_"
    private const val LOG_PREFIX_LENGTH = LOG_PREFIX.length
    private const val MAX_LOG_TAG_LENGTH = 23

    private fun makeLogTag(str: String): String {
        return if (str.length > MAX_LOG_TAG_LENGTH - LOG_PREFIX_LENGTH) {
            LOG_PREFIX + str.substring(0, MAX_LOG_TAG_LENGTH - LOG_PREFIX_LENGTH - 1)
        } else LOG_PREFIX + str

    }

    /**
     * Don't use this when obfuscating class names!
     */
    internal fun makeLogTag(cls: Class<*>): String {
        return makeLogTag(cls.simpleName)
    }


    internal fun v(tag: String, vararg messages: Any) {
        // Only log VERBOSE if build type is DEBUG
        if (BuildConfig.DEBUG) {
            log(tag, Log.VERBOSE, null, *messages)
        }
    }

    internal fun d(tag: String, vararg messages: Any) {
        // Only log DEBUG if build type is DEBUG
        if (BuildConfig.DEBUG) {
            log(tag, Log.INFO, null, *messages)
        }
    }

    internal fun i(tag: String, vararg messages: Any) {
        log(tag, Log.INFO, null, *messages)
    }

    internal fun w(tag: String, vararg messages: Any) {
        log(tag, Log.WARN, null, *messages)
    }

    internal fun w(tag: String, t: Throwable, vararg messages: Any) {
        log(tag, Log.WARN, t, *messages)
    }

    internal fun e(tag: String, vararg messages: Any) {
        log(tag, Log.ERROR, null, *messages)
    }

    internal fun e(tag: String, t: Throwable, vararg messages: Any) {
        log(tag, Log.ERROR, t, *messages)
    }

    private fun log(tag: String, level: Int, t: Throwable?, vararg messages: Any) {
        if (Log.isLoggable(tag, level)) {
            val message: String
            message = if (t == null && messages.size == 1) {
                // handle this common case without the extra cost of creating a stringbuffer:
                messages[0].toString()
            } else {
                val sb = StringBuilder()
                for (m in messages) {
                    sb.append(m)
                }
                if (t != null) {
                    sb.append("\n").append(Log.getStackTraceString(t))
                }
                sb.toString()
            }
            Log.println(level, tag, message)
        }
    }
}