package p000;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: renamed from: ۦٔؔؒۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4173 {

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f13897;

    /* JADX INFO: renamed from: ۥُ */
    public final /* synthetic */ C4474 f13898;

    /* JADX INFO: renamed from: ۥۗ */
    public final long f13899;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f13900;

    /* JADX INFO: renamed from: ۦؑ */
    public long f13901;

    public C4173(C4474 c4474, String str, long j) {
        Objects.requireNonNull(c4474);
        this.f13898 = c4474;
        AbstractC0487.m1090(str);
        this.f13900 = str;
        this.f13899 = j;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m7370(long j) {
        SharedPreferences.Editor editorEdit = this.f13898.m7755().edit();
        editorEdit.putLong(this.f13900, j);
        editorEdit.apply();
        this.f13901 = j;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final long m7371() {
        if (!this.f13897) {
            this.f13897 = true;
            this.f13901 = this.f13898.m7755().getLong(this.f13900, this.f13899);
        }
        return this.f13901;
    }
}
