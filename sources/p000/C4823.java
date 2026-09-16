package p000;

import android.util.JsonReader;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.Optional;
import java.util.function.Function;

/* JADX INFO: renamed from: ۦٞؗۥۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4823 implements Function {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f15888;

    public /* synthetic */ C4823(int i) {
        this.f15888 = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        File file = (File) obj;
        switch (this.f15888) {
            case 0:
                String name = file.getName();
                name.getClass();
                if (name.equals("trigger-type-anomaly")) {
                    return 8;
                }
                return !name.equals("trigger-type-oom") ? 0 : 7;
            default:
                try {
                    C3404 c3404 = C1372.f4697;
                    String strM2902 = C1372.m2902(file);
                    c3404.getClass();
                    try {
                        JsonReader jsonReader = new JsonReader(new StringReader(strM2902));
                        try {
                            C4321 c4321M6162 = C3404.m6162(jsonReader);
                            jsonReader.close();
                            return Optional.of(c4321M6162);
                        } catch (Throwable th) {
                            try {
                                jsonReader.close();
                                break;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IllegalStateException e) {
                        throw new IOException(e);
                    }
                } catch (IOException e2) {
                    Log.w("FirebaseCrashlytics", "Unable to read the Profiling Manager file ", e2);
                    return Optional.empty();
                }
        }
    }
}
