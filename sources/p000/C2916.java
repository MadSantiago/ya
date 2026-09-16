package p000;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: ۥؚْۨؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2916 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String[] f9721;

    /* JADX INFO: renamed from: ۥۗ */
    public final int[] f9722;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3369 f9723;

    /* JADX INFO: renamed from: ۦؑ */
    public final Set f9724;

    public C2916(C3369 c3369, int[] iArr, String[] strArr) {
        this.f9723 = c3369;
        this.f9722 = iArr;
        this.f9721 = strArr;
        if (iArr.length == strArr.length) {
            this.f9724 = !(strArr.length == 0) ? Collections.singleton(strArr[0]) : C1590.f5346;
        } else {
            C1078.m2276("Check failed.");
            throw null;
        }
    }
}
