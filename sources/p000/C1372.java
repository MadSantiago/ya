package p000;

import android.os.Build;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.Optional;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;

/* JADX INFO: renamed from: ۥُٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1372 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C5534 f4698;

    /* JADX INFO: renamed from: ۥۗ */
    public final C2711 f4699;

    /* JADX INFO: renamed from: ۥۣ */
    public final AtomicInteger f4700 = new AtomicInteger(0);

    /* JADX INFO: renamed from: ۦؑ */
    public final C2702 f4701;

    /* JADX INFO: renamed from: ۥُ */
    public static final Charset f4693 = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: ۥّ */
    public static final int f4694 = 15;

    /* JADX INFO: renamed from: ۦۙ */
    public static final C3404 f4697 = new C3404();

    /* JADX INFO: renamed from: ۥۜ */
    public static final C1068 f4695 = new C1068(2);

    /* JADX INFO: renamed from: ۦٛ */
    public static final C5680 f4696 = new C5680(3);

    public C1372(C2711 c2711, C5534 c5534, C2702 c2702) {
        this.f4699 = c2711;
        this.f4698 = c5534;
        this.f4701 = c2702;
    }

    /* JADX INFO: renamed from: ۥّ */
    public static String m2902(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f4693);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m2903(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public static void m2904(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f4693);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final ArrayList m2905() {
        ArrayList arrayList = new ArrayList();
        C2711 c2711 = this.f4699;
        arrayList.addAll(C2711.m5033(((File) c2711.f8982).listFiles()));
        arrayList.addAll(C2711.m5033(((File) c2711.f8983).listFiles()));
        C1068 c1068 = f4695;
        Collections.sort(arrayList, c1068);
        List listM5033 = C2711.m5033(((File) c2711.f8979).listFiles());
        Collections.sort(listM5033, c1068);
        arrayList.addAll(listM5033);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m2906(AbstractC4841 abstractC4841, String str, boolean z) {
        C2711 c2711 = this.f4699;
        int i = this.f4698.m9209().f16724.f6551;
        f4697.getClass();
        try {
            m2904(c2711.m5036(str, AbstractC3761.m6629("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f4700.getAndIncrement())), z ? "_" : "")), C3404.f11324.m8700(abstractC4841));
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e);
        }
        C5680 c5680 = new C5680(4);
        File file = new File((File) c2711.f8981, str);
        file.mkdirs();
        List<File> listM5033 = C2711.m5033(file.listFiles(c5680));
        Collections.sort(listM5033, new C1068(3));
        int size = listM5033.size();
        for (File file2 : listM5033) {
            if (size <= i) {
                return;
            }
            C2711.m5034(file2);
            size--;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final AbstractC4841 m2907(String str, final C3302 c3302) {
        String str2 = c3302.f11055;
        return (Build.VERSION.SDK_INT < 37 || !(str2.equals("crash") || str2.equals("ndk-crash"))) ? c3302 : (AbstractC4841) Optional.of(this.f4699.m5036(str, "profiling-manager-info")).filter(new C1142(1)).flatMap(new C4823(1)).map(new Function() { // from class: ۦُؙۣؖ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                AbstractC1942 abstractC1942 = (AbstractC1942) obj;
                C3302 c3303 = c3302;
                C4725 c4725M6061 = c3303.m6061();
                AbstractC5497 abstractC5497 = c3303.f11052;
                C1771 c1771Mo5025 = abstractC5497.mo5025();
                C3123 c3123 = (C3123) ((C2701) abstractC5497).f8957;
                List list = c3123.f10461;
                AbstractC2237 abstractC2237 = c3123.f10460;
                AbstractC5574 abstractC5574 = c3123.f10457;
                C1668 c1668 = c3123.f10458;
                List list2 = c3123.f10459;
                if (list2 != null) {
                    c1771Mo5025.f5908 = new C3123(list, abstractC2237, abstractC5574, abstractC1942, c1668, list2);
                    c4725M6061.f15596 = c1771Mo5025.m3562();
                    return c4725M6061.m8054();
                }
                StringBuilder sb = new StringBuilder();
                if (list2 == null) {
                    sb.append(" binaries");
                }
                C1078.m2276(AbstractC3761.m6636("Missing required properties:", sb));
                return null;
            }
        }).orElse(c3302);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final NavigableSet m2908() {
        return new TreeSet(C2711.m5033(((File) this.f4699.f8981).list())).descendingSet();
    }
}
