package p000;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: renamed from: ۥؘِؒۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0656 {

    /* JADX INFO: renamed from: ۥۣ */
    public final long f2434;

    public C0656(long j) {
        this.f2434 = j;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static C0656 m1467(BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        C0656 c0656 = new C0656(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return c0656;
                    }
                    C0656 c0657 = new C0656(jsonReader.nextLong());
                    jsonReader.close();
                    return c0657;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C0656) && this.f2434 == ((C0656) obj).f2434;
    }

    public final int hashCode() {
        long j = this.f2434;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f2434 + "}";
    }
}
