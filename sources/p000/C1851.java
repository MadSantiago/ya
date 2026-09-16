package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: renamed from: ۥًٜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1851 implements InterfaceC1804 {

    /* JADX INFO: renamed from: ۥْ */
    public static final Charset f6138 = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: ۦ۟ */
    public C4030 f6139;

    /* JADX INFO: renamed from: ۦۨ */
    public final File f6140;

    public C1851(File file) {
        this.f6140 = file;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    @Override // p000.InterfaceC1804
    /* JADX INFO: renamed from: ۥّ */
    public final String mo3587() {
        C0322 c0322;
        byte[] bArr;
        int i = 0;
        if (this.f6140.exists()) {
            m3637();
            C4030 c4030 = this.f6139;
            if (c4030 == null) {
                c0322 = null;
            } else {
                int[] iArr = {0};
                byte[] bArr2 = new byte[c4030.m7210()];
                try {
                    this.f6139.m7211(new C2346(i, bArr2, iArr));
                } catch (IOException e) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", e);
                }
                c0322 = new C0322(iArr[0], 9, bArr2);
            }
        } else {
            c0322 = null;
        }
        if (c0322 == null) {
            bArr = null;
        } else {
            int i2 = c0322.f1179;
            bArr = new byte[i2];
            System.arraycopy((byte[]) c0322.f1178, 0, bArr, 0, i2);
        }
        if (bArr != null) {
            return new String(bArr, f6138);
        }
        return null;
    }

    @Override // p000.InterfaceC1804
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo3588() {
        AbstractC2133.m4138(this.f6139, "There was a problem closing the Crashlytics log file.");
        this.f6139 = null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m3637() {
        File file = this.f6140;
        if (this.f6139 == null) {
            try {
                this.f6139 = new C4030(file);
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file, e);
            }
        }
    }

    @Override // p000.InterfaceC1804
    /* JADX INFO: renamed from: ۦۗ */
    public final void mo3589(long j, String str) {
        m3637();
        if (this.f6139 == null) {
            return;
        }
        try {
            if (str.length() > 16384) {
                str = "...".concat(str.substring(str.length() - 16384));
            }
            this.f6139.m7206(String.format(Locale.US, "%d %s%n", Long.valueOf(j), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f6138));
            while (!this.f6139.m7201() && this.f6139.m7210() > 65536) {
                this.f6139.m7209();
            }
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", e);
        }
    }
}
