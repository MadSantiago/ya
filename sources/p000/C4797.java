package p000;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: ۦؚٞؕؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4797 {

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f15819;

    /* JADX INFO: renamed from: ۥُ */
    public final /* synthetic */ C4474 f15820;

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f15821;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f15822;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f15823;

    public C4797(C4474 c4474, String str, boolean z) {
        this.f15820 = c4474;
        AbstractC0487.m1090(str);
        this.f15822 = str;
        this.f15821 = z;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m8174(boolean z) {
        SharedPreferences.Editor editorEdit = this.f15820.m7755().edit();
        editorEdit.putBoolean(this.f15822, z);
        editorEdit.apply();
        this.f15823 = z;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m8175() {
        if (!this.f15819) {
            this.f15819 = true;
            this.f15823 = this.f15820.m7755().getBoolean(this.f15822, this.f15821);
        }
        return this.f15823;
    }
}
