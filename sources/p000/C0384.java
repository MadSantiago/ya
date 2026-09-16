package p000;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* JADX INFO: renamed from: ۥؔؒۦؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0384 implements InterfaceC2142, InterfaceC5058 {

    /* JADX INFO: renamed from: ۥَ */
    public Object f1428;

    /* JADX INFO: renamed from: ۥْ */
    public int f1429;

    /* JADX INFO: renamed from: ۥٓ */
    public int f1430;

    /* JADX INFO: renamed from: ۥٖ */
    public Cloneable f1431;

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f1432;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f1433;

    public C0384(C0384 c0384) {
        this.f1433 = 1;
        ClipData clipData = (ClipData) c0384.f1432;
        clipData.getClass();
        this.f1432 = clipData;
        int i = c0384.f1429;
        if (i < 0) {
            Locale locale = Locale.US;
            C1078.m2272("source is out of range of [0, 5] (too low)");
            throw null;
        }
        if (i > 5) {
            Locale locale2 = Locale.US;
            C1078.m2272("source is out of range of [0, 5] (too high)");
            throw null;
        }
        this.f1429 = i;
        int i2 = c0384.f1430;
        if ((i2 & 1) == i2) {
            this.f1430 = i2;
            this.f1428 = (Uri) c0384.f1428;
            this.f1431 = (Bundle) c0384.f1431;
            return;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
    }

    @Override // p000.InterfaceC2142
    public C5336 build() {
        return new C5336(new C0384(this));
    }

    @Override // p000.InterfaceC2142
    public void setExtras(Bundle bundle) {
        this.f1431 = bundle;
    }

    public String toString() {
        String strValueOf;
        String str;
        switch (this.f1433) {
            case 1:
                Uri uri = (Uri) this.f1428;
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(((ClipData) this.f1432).getDescription());
                sb.append(", source=");
                int i = this.f1429;
                if (i == 0) {
                    strValueOf = "SOURCE_APP";
                } else if (i == 1) {
                    strValueOf = "SOURCE_CLIPBOARD";
                } else if (i == 2) {
                    strValueOf = "SOURCE_INPUT_METHOD";
                } else if (i == 3) {
                    strValueOf = "SOURCE_DRAG_AND_DROP";
                } else if (i != 4) {
                    strValueOf = i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT";
                } else {
                    strValueOf = "SOURCE_AUTOFILL";
                }
                sb.append(strValueOf);
                sb.append(", flags=");
                int i2 = this.f1430;
                sb.append((i2 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i2));
                if (uri == null) {
                    str = "";
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str);
                return AbstractC3761.m6621(sb, ((Bundle) this.f1431) != null ? ", hasExtras" : "", "}");
            default:
                return super.toString();
        }
    }

    @Override // p000.InterfaceC5058
    /* JADX INFO: renamed from: ۥؗ */
    public int mo838() {
        return this.f1430;
    }

    @Override // p000.InterfaceC5058
    /* JADX INFO: renamed from: ۥُ */
    public ContentInfo mo839() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [int[], java.lang.Cloneable] */
    /* JADX INFO: renamed from: ۥۗ */
    public int m840(long j) {
        int i = this.f1429 + 1;
        long[] jArr = (long[]) this.f1432;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
            AbstractC0246.m516(0, 0, 14, (int[]) this.f1428, iArr);
            this.f1432 = jArr2;
            this.f1428 = iArr;
        }
        int i3 = this.f1429;
        this.f1429 = i3 + 1;
        int[] iArr2 = (int[]) this.f1431;
        int length2 = iArr2.length;
        Object[] objArr = iArr2;
        if (this.f1430 >= length2) {
            int i4 = length2 * 2;
            ?? r1 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                r1[i5] = i6;
                i5 = i6;
            }
            AbstractC0246.m516(0, 0, 14, (int[]) this.f1431, r1);
            this.f1431 = r1;
            objArr = r1;
        }
        Object[] objArr2 = objArr;
        int i7 = this.f1430;
        this.f1430 = objArr[i7];
        long[] jArr3 = (long[]) this.f1432;
        jArr3[i3] = j;
        ((int[]) this.f1428)[i3] = i7;
        objArr2[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (AbstractC3831.m6844(jArr3[i8], j) <= 0) {
                break;
            }
            m843(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    @Override // p000.InterfaceC5058
    /* JADX INFO: renamed from: ۥۜ */
    public int mo841() {
        return this.f1429;
    }

    @Override // p000.InterfaceC5058
    /* JADX INFO: renamed from: ۥۣ */
    public ClipData mo842() {
        return (ClipData) this.f1432;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public void m843(int i, int i2) {
        long[] jArr = (long[]) this.f1432;
        int[] iArr = (int[]) this.f1428;
        int[] iArr2 = (int[]) this.f1431;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    @Override // p000.InterfaceC2142
    /* JADX INFO: renamed from: ۦِ */
    public void mo844(Uri uri) {
        this.f1428 = uri;
    }

    @Override // p000.InterfaceC2142
    /* JADX INFO: renamed from: ۦۨ */
    public void mo845(int i) {
        this.f1430 = i;
    }

    public /* synthetic */ C0384(int i) {
        this.f1433 = i;
    }
}
