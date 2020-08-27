package com.jakewharton.diffuse.info

import com.jakewharton.diffuse.Aar
import com.jakewharton.diffuse.report.Report
import com.jakewharton.diffuse.report.text.AarInfoTextReport

internal class AarInfo(
  private val aar: Aar,
) : BinaryInfo {
  override fun toTextReport(): Report {
    return AarInfoTextReport(aar)
  }
}