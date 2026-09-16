package com.scottyab.rootbeer;

import p000.AbstractC5537;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class RootBeerNative {

    /* JADX INFO: renamed from: ۥۣ */
    public static final boolean f358;

    static {
        try {
            System.loadLibrary("toolChecker");
            f358 = true;
        } catch (UnsatisfiedLinkError e) {
            AbstractC5537.m9246(e);
        }
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z);
}
