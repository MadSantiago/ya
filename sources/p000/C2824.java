package p000;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: ۥۦٍؗؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2824 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C1039 f9437;

    /* JADX INFO: renamed from: ۥۗ */
    public int f9438 = 0;

    /* JADX INFO: renamed from: ۥۣ */
    public final XmlPullParser f9439;

    public C2824(XmlResourceParser xmlResourceParser) {
        this.f9439 = xmlResourceParser;
        C1039 c1039 = new C1039(2, false);
        c1039.f3672 = new float[64];
        this.f9437 = c1039;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2824)) {
            return false;
        }
        C2824 c2824 = (C2824) obj;
        return AbstractC3831.m6874(this.f9439, c2824.f9439) && this.f9438 == c2824.f9438;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9438) + (this.f9439.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.f9439);
        sb.append(", config=");
        return AbstractC3761.m6638(sb, this.f9438, ')');
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m5390(int i) {
        this.f9438 = i | this.f9438;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final float m5391(TypedArray typedArray, String str, int i, float f) {
        if (AbstractC0186.m408(this.f9439, str)) {
            f = typedArray.getFloat(i, f);
        }
        m5390(typedArray.getChangingConfigurations());
        return f;
    }
}
