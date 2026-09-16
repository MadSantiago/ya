package p000;

import java.io.File;
import java.util.Comparator;

/* JADX INFO: renamed from: ۥُؗٝؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1068 implements Comparator {

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f3750;

    public /* synthetic */ C1068(int i) {
        this.f3750 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3750) {
            case 0:
                return AbstractC3831.m6879(((C1054) obj2).f3725, ((C1054) obj).f3725);
            case 1:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                String name = ((File) obj).getName();
                int i = C1372.f4694;
                return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    byte b = bArr[i2];
                    byte b2 = bArr2[i2];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return AbstractC3831.m6879(((C3067) obj).f10308, ((C3067) obj2).f10308);
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                C3046 c3046 = (C3046) obj;
                C3046 c3047 = (C3046) obj2;
                return (c3046.f6005 - c3046.f6006) - (c3047.f6005 - c3047.f6006);
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                C0605 c0605 = (C0605) obj;
                C0605 c0606 = (C0605) obj2;
                float f = c0605.f2261.f4252.f7761;
                float f2 = c0606.f2261.f4252.f7761;
                return f == f2 ? AbstractC3831.m6879(c0605.m1362(), c0606.m1362()) : Float.compare(f, f2);
            case 8:
                return AbstractC3831.m6879(((C5851) obj).f19289, ((C5851) obj2).f19289);
            default:
                return ((C0368) ((AbstractC5679) obj)).f1356.compareTo(((C0368) ((AbstractC5679) obj2)).f1356);
        }
    }
}
