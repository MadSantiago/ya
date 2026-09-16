package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦۘؗؓۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5054 {

    /* JADX INFO: renamed from: ۥؗ */
    public float f16773;

    /* JADX INFO: renamed from: ۥُ */
    public float f16774;

    /* JADX INFO: renamed from: ۥۗ */
    public float f16776;

    /* JADX INFO: renamed from: ۥۣ */
    public float f16777;

    /* JADX INFO: renamed from: ۦؑ */
    public float f16778;

    /* JADX INFO: renamed from: ۥّ */
    public final ArrayList f16775 = new ArrayList();

    /* JADX INFO: renamed from: ۦۙ */
    public final ArrayList f16779 = new ArrayList();

    public C5054() {
        m8579(0.0f, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m8576(float f, float f2) {
        C1939 c1939 = new C1939();
        c1939.f6400 = f;
        c1939.f6399 = f2;
        this.f16775.add(c1939);
        C5516 c5516 = new C5516(c1939, this.f16776, this.f16773);
        float fM9203 = c5516.m9203() + 270.0f;
        float fM9204 = c5516.m9203() + 270.0f;
        m8578(fM9203);
        this.f16779.add(c5516);
        this.f16778 = fM9204;
        this.f16776 = f;
        this.f16773 = f2;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m8577(Matrix matrix, Path path) {
        ArrayList arrayList = this.f16775;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC3859) arrayList.get(i)).mo3803(matrix, path);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m8578(float f) {
        float f2 = this.f16778;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.f16776;
        float f5 = this.f16773;
        C2974 c2974 = new C2974(f4, f5, f4, f5);
        c2974.f9963 = this.f16778;
        c2974.f9966 = f3;
        this.f16779.add(new C4918(c2974));
        this.f16778 = f;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m8579(float f, float f2, float f3) {
        this.f16777 = f;
        this.f16776 = 0.0f;
        this.f16773 = f;
        this.f16778 = f2;
        this.f16774 = (f2 + f3) % 360.0f;
        this.f16775.clear();
        this.f16779.clear();
    }
}
