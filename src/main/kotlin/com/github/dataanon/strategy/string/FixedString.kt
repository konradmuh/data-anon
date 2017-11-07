package com.github.dataanon.strategy.string

import com.github.dataanon.Field
import com.github.dataanon.Record
import com.github.dataanon.strategy.AnonymizationStrategy

class FixedString(val value: String) : AnonymizationStrategy<String> {

    override fun anonymize(field: Field<String>, record: Record): String  = value
}