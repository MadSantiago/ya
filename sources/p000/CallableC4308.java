package p000;

import android.net.Uri;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.logging.Level;

/* JADX INFO: renamed from: ۦًٖؕۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC4308 implements Callable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f14248;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f14249;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f14250;

    public CallableC4308(C5034 c5034, C5855 c5855) {
        this.f14250 = 3;
        this.f14249 = c5855;
        Objects.requireNonNull(c5034);
        this.f14248 = c5034;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f14250;
        Object obj = this.f14248;
        Object obj2 = this.f14249;
        switch (i) {
            case 0:
                long[] jArr = ((C4441) obj2).f14642;
                int length = jArr.length;
                int i2 = (length - 1) * 8;
                byte[] bArr = new byte[i2];
                Random random = new Random(jArr[0]);
                for (int i3 = 1; i3 < length; i3++) {
                    long jNextLong = jArr[i3] ^ random.nextLong();
                    int i4 = (i3 - 1) * 8;
                    int iMin = Math.min(i2, i4 + 8);
                    while (i4 < iMin) {
                        bArr[i4] = (byte) jNextLong;
                        jNextLong >>= 8;
                        i4++;
                    }
                }
                while (i2 > 0) {
                    int i5 = i2 - 1;
                    if (bArr[i5] == 0) {
                        i2 = i5;
                    }
                }
                try {
                    try {
                        String str = new String(bArr, 0, i2, C4441.f14641);
                        Arrays.fill(bArr, 0, i2, (byte) 0);
                        return str;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception e2) {
                        throw new IllegalStateException(e2);
                    }
                } catch (Throwable th) {
                    Arrays.fill(bArr, 0, i2, (byte) 0);
                    throw th;
                }
            case 1:
                C5034 c5034 = ((BinderC5179) obj).f17131;
                c5034.m8494();
                C1159 c1159 = c5034.f16670;
                C5034.m8484(c1159);
                return c1159.m2425((String) obj2);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C5034 c5035 = ((BinderC5179) obj).f17131;
                c5035.m8494();
                return new C1103(c5035.m8543(((C5855) obj2).f19339));
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C5855 c5855 = (C5855) obj2;
                String str2 = c5855.f19339;
                AbstractC0487.m1047(str2);
                C5034 c5036 = (C5034) obj;
                C5211 c5211M8492 = c5036.m8492(str2);
                EnumC4635 enumC4635 = EnumC4635.f15299;
                if (c5211M8492.m8815(enumC4635) && C5211.m8806(100, c5855.f19329).m8815(enumC4635)) {
                    return c5036.m8497(c5855).m5545();
                }
                c5036.mo2404().f12023.m9432("Analytics storage consent denied. Returning null app instance id");
                return null;
            default:
                C5460 c5460 = (C5460) obj2;
                C0268 c0268 = (C0268) obj;
                C0996 c0996 = (C0996) c5460.f18001;
                C4898 c4898 = new C4898();
                try {
                    C4810 c4810 = (C4810) c0996.f3560.get();
                    Uri uri = (Uri) c5460.f17999;
                    C4898 c4899 = new C4898(c0268);
                    c4899.f16142 = new C4898[]{c4898};
                    break;
                } catch (IOException | RuntimeException e3) {
                    AbstractC1631.m3424(Level.WARNING, c0996.m2177(), e3, "Failed to update snapshot for %s flags may be stale.", (String) c5460.f18000);
                }
                return null;
        }
    }

    public /* synthetic */ CallableC4308(BinderC5179 binderC5179, Object obj, int i) {
        this.f14250 = i;
        this.f14249 = obj;
        this.f14248 = binderC5179;
    }

    public /* synthetic */ CallableC4308(C5460 c5460, C0268 c0268) {
        this.f14250 = 4;
        this.f14249 = c5460;
        this.f14248 = c0268;
    }

    public CallableC4308(C4441 c4441) {
        this.f14250 = 0;
        this.f14248 = c4441;
        this.f14250 = 0;
        this.f14249 = c4441;
    }
}
