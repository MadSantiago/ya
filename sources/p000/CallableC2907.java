package p000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: ۥۨؒۗٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC2907 implements Callable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ int f9695;

    /* JADX INFO: renamed from: ۦ۟ */
    public final List f9696;

    /* JADX INFO: renamed from: ۦۨ */
    public final InputStream f9697;

    public CallableC2907(InputStream inputStream, List list, int i) {
        this.f9695 = i;
        this.f9697 = inputStream;
        this.f9696 = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        int i;
        switch (this.f9695) {
            case 0:
                m5480(false);
                return null;
            default:
                String strM5480 = m5480(true);
                if (strM5480 == null) {
                    i = 1;
                } else {
                    try {
                        i = Integer.parseInt(strM5480);
                    } catch (NumberFormatException unused) {
                        return 1;
                    }
                }
                return Integer.valueOf(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX INFO: renamed from: ۥۣ */
    public final String m5480(boolean z) throws IOException {
        boolean z2;
        List list;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f9697, StandardCharsets.UTF_8));
        do {
            String line = bufferedReader.readLine();
            z2 = false;
            if (line != null) {
                int length = line.length();
                int i = length - 36;
                boolean zStartsWith = line.startsWith(C4432.f14605, i);
                if (!zStartsWith) {
                    list = this.f9696;
                    if (list != null) {
                        list.add(line);
                    }
                    z2 = !zStartsWith;
                } else if (length != 36) {
                    line = line.substring(0, i);
                    list = this.f9696;
                    if (list != null) {
                        list.add(line);
                    }
                    z2 = !zStartsWith;
                }
            }
        } while (z2);
        if (z) {
            return bufferedReader.readLine();
        }
        return null;
    }
}
