package p000;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: ۦؖؕٙٛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC3360 implements Callable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ BinderC4567 f11231;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ String f11232;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ boolean f11233;

    public /* synthetic */ CallableC3360(boolean z, String str, BinderC4567 binderC4567) {
        this.f11233 = z;
        this.f11232 = str;
        this.f11231 = binderC4567;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z = this.f11233;
        String str = this.f11232;
        BinderC4567 binderC4567 = this.f11231;
        String str2 = (z || !AbstractC1473.m3088(str, binderC4567, true, false).f18035) ? "not allowed" : "debug cert rejected";
        int i = 0;
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
                if (messageDigest != null) {
                    break;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        AbstractC0487.m1047(messageDigest);
        byte[] bArrDigest = messageDigest.digest(binderC4567.f15075);
        int length = bArrDigest.length;
        char[] cArr = new char[length + length];
        int i2 = 0;
        for (byte b : bArrDigest) {
            char[] cArr2 = AbstractC3831.f12713;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
            i2 += 2;
        }
        return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z + ", ver=12451000.false";
    }
}
