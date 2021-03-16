package com.bilalfazlani.scala.rainbow
import Console.*

case class ColorContext(enable:Boolean)

/**
 * To use rainbow simply do the following:
 * '''
 * import com.bilalfazlani.scala.rainbow._
 * println { "Red warning".red }
 * '''
 */
extension(s:String) {
  /** Colorize the given string foreground to ANSI black */
  def black(using colorContext:ColorContext) = if(colorContext.enable) then BLACK + s + RESET else s

  /** Colorize the given string foreground to ANSI red */
  def red(using colorContext:ColorContext) = if(colorContext.enable) then RED + s + RESET else s

  /** Colorize the given string foreground to ANSI green */
  def green(using colorContext:ColorContext) = if(colorContext.enable) then GREEN + s + RESET else s

  /** Colorize the given string foreground to ANSI yellow */
  def yellow(using colorContext:ColorContext) = if(colorContext.enable) then YELLOW + s + RESET else s

  /** Colorize the given string foreground to ANSI blue */
  def blue(using colorContext:ColorContext) = if(colorContext.enable) then BLUE + s + RESET else s

  /** Colorize the given string foreground to ANSI magenta */
  def magenta(using colorContext:ColorContext) = if(colorContext.enable) then MAGENTA + s + RESET else s

  /** Colorize the given string foreground to ANSI cyan */
  def cyan(using colorContext:ColorContext) = if(colorContext.enable) then CYAN + s + RESET else s

  /** Colorize the given string foreground to ANSI white */
  def white(using colorContext:ColorContext) = if(colorContext.enable) then WHITE + s + RESET else s

  /** Colorize the given string background to ANSI black */
  def onBlack(using colorContext:ColorContext) = if(colorContext.enable) then BLACK_B + s + RESET else s

  /** Colorize the given string background to ANSI red */
  def onRed(using colorContext:ColorContext) = if(colorContext.enable) then RED_B + s + RESET else s

  /** Colorize the given string background to ANSI green */
  def onGreen(using colorContext:ColorContext) = if(colorContext.enable) then GREEN_B + s + RESET else s

  /** Colorize the given string background to ANSI yellow */
  def onYellow(using colorContext:ColorContext) = if(colorContext.enable) then YELLOW_B + s + RESET else s

  /** Colorize the given string background to ANSI blue */
  def onBlue(using colorContext:ColorContext) = if(colorContext.enable) then BLUE_B + s + RESET else s

  /** Colorize the given string background to ANSI magenta */
  def onMagenta(using colorContext:ColorContext) = if(colorContext.enable) then MAGENTA_B + s + RESET else s

  /** Colorize the given string background to ANSI cyan */
  def onCyan(using colorContext:ColorContext) = if(colorContext.enable) then CYAN_B + s + RESET else s

  /** Colorize the given string background to ANSI white */
  def onWhite(using colorContext:ColorContext) = if(colorContext.enable) then WHITE_B + s + RESET else s

  /** Make the given string bold */
  def bold(using colorContext:ColorContext) = if(colorContext.enable) then BOLD + s + RESET else s

  /** Underline the given string */
  def underlined(using colorContext:ColorContext) = if(colorContext.enable) then UNDERLINED + s + RESET else s

  /** Make the given string blink (some terminals may turn this off) */
  def blink(using colorContext:ColorContext) = if(colorContext.enable) then BLINK + s + RESET else s

  /** Reverse the ANSI colors of the given string */
  def reversed(using colorContext:ColorContext) = if(colorContext.enable) then REVERSED + s + RESET else s

  /** Make the given string invisible using ANSI color codes */
  def invisible(using colorContext:ColorContext) = if(colorContext.enable) then INVISIBLE + s + RESET else s
}
