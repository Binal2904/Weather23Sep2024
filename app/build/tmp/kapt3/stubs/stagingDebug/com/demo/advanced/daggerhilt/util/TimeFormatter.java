package com.demo.advanced.daggerhilt.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/demo/advanced/daggerhilt/util/TimeFormatter;", "", "()V", "Companion", "app_stagingDebug"})
public final class TimeFormatter {
    @org.jetbrains.annotations.NotNull
    public static final com.demo.advanced.daggerhilt.util.TimeFormatter.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static java.text.SimpleDateFormat TODAY_DATE_FORMAT;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String TIME_FORMAT = "hh:mm aa";
    
    public TimeFormatter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0007J\n\u0010\r\u001a\u00020\u0004*\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/demo/advanced/daggerhilt/util/TimeFormatter$Companion;", "", "()V", "TIME_FORMAT", "", "TODAY_DATE_FORMAT", "Ljava/text/SimpleDateFormat;", "getTODAY_DATE_FORMAT", "()Ljava/text/SimpleDateFormat;", "setTODAY_DATE_FORMAT", "(Ljava/text/SimpleDateFormat;)V", "getCurrentDateTime", "dateFormat", "toFormattedTime", "", "app_stagingDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.text.SimpleDateFormat getTODAY_DATE_FORMAT() {
            return null;
        }
        
        public final void setTODAY_DATE_FORMAT(@org.jetbrains.annotations.NotNull
        java.text.SimpleDateFormat p0) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String toFormattedTime(long $this$toFormattedTime) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
        public final java.lang.String getCurrentDateTime(@org.jetbrains.annotations.NotNull
        java.lang.String dateFormat) {
            return null;
        }
    }
}