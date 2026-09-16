package p000;

import android.os.Trace;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.logging.Logger;

/* JADX INFO: renamed from: ۦًٕؗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3679 implements Runnable {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f12287;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f12288;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f12289;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f12290;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f12291;

    public /* synthetic */ RunnableC3679(C4992 c4992, String str, InterfaceC4448 interfaceC4448, C3543 c3543, C4206 c4206) {
        this.f12291 = 1;
        this.f12290 = str;
        this.f12288 = interfaceC4448;
        this.f12289 = c3543;
        this.f12287 = c4206;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        BufferedWriter bufferedWriter;
        Exception e;
        BufferedWriter bufferedWriter2;
        int i = this.f12291;
        ?? r1 = 0;
        ?? r2 = 0;
        Object obj = this.f12287;
        Object obj2 = this.f12289;
        Object obj3 = this.f12288;
        Object obj4 = this.f12290;
        switch (i) {
            case 0:
                C1934 c1934 = (C1934) obj4;
                C1360 c1360 = (C1360) obj3;
                String str = c1360.f4676;
                InterfaceC4070 interfaceC4070 = (InterfaceC4070) obj2;
                C3245 c3245 = (C3245) obj;
                c1934.getClass();
                Logger logger = C1934.f6391;
                try {
                    InterfaceC3586 interfaceC3586M1268 = c1934.f6392.m1268(str);
                    if (interfaceC3586M1268 == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        interfaceC4070.mo398(new IllegalArgumentException(str2));
                    } else {
                        c1934.f6393.m3609(new C2035(c1934, c1360, ((C5782) interfaceC3586M1268).m9600(c3245), 1));
                        interfaceC4070.mo398(null);
                    }
                    return;
                } catch (Exception e2) {
                    logger.warning("Error scheduling event " + e2.getMessage());
                    interfaceC4070.mo398(e2);
                    return;
                }
            case 1:
                String str3 = (String) obj4;
                InterfaceC4448 interfaceC4448 = (InterfaceC4448) obj3;
                C3543 c3543 = (C3543) obj2;
                C4206 c4206 = (C4206) obj;
                boolean zM9353 = AbstractC5568.m9353();
                if (zM9353) {
                    try {
                        Trace.beginSection(AbstractC5568.m9363(str3));
                    } catch (Throwable th) {
                        if (zM9353) {
                            Trace.endSection();
                        }
                        throw th;
                    }
                }
                try {
                    interfaceC4448.mo449();
                    C0943 c0943 = C2796.f9349;
                    c3543.m6346(c0943);
                    c4206.m7429(c0943);
                    break;
                } catch (Throwable th2) {
                    c3543.m6346(new C4514(th2));
                    c4206.m7428(th2);
                    break;
                }
                if (zM9353) {
                    Trace.endSection();
                    return;
                }
                return;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                List list = (List) obj4;
                C1860 c1860 = (C1860) obj3;
                C2813 c2813 = (C2813) obj2;
                WorkDatabase workDatabase = (WorkDatabase) obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((InterfaceC1025) it.next()).mo2236(c1860.f6202);
                }
                AbstractC5554.m9308(c2813, workDatabase, list);
                return;
            default:
                C2711 c2711 = (C2711) obj4;
                String str4 = (String) obj3;
                Map map = (Map) obj2;
                List list2 = (List) obj;
                C1640 c1640 = (C1640) c2711.f8984;
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) c2711.f8983;
                if (((String) atomicMarkableReference.getReference()) != null) {
                    String str5 = (String) atomicMarkableReference.getReference();
                    ?? r8 = "user-data";
                    File fileM5036 = c1640.f5483.m5036(str4, "user-data");
                    try {
                        try {
                            C2899 c2899 = new C2899();
                            c2899.put("userId", str5);
                            String string = c2899.toString();
                            bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileM5036), C1640.f5482));
                            try {
                                bufferedWriter2.write(string);
                                bufferedWriter2.flush();
                                r8 = bufferedWriter2;
                            } catch (Exception e3) {
                                e = e3;
                                Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                                r8 = bufferedWriter2;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            bufferedWriter2 = null;
                        } catch (Throwable th3) {
                            th = th3;
                            AbstractC2133.m4138(r2, "Failed to close user metadata file.");
                            throw th;
                        }
                        AbstractC2133.m4138(r8, "Failed to close user metadata file.");
                    } catch (Throwable th4) {
                        th = th4;
                        r2 = r8;
                        AbstractC2133.m4138(r2, "Failed to close user metadata file.");
                        throw th;
                    }
                    break;
                }
                if (!map.isEmpty()) {
                    c1640.m3456(str4, map, false);
                }
                if (list2.isEmpty()) {
                    return;
                }
                File fileM5037 = c1640.f5483.m5036(str4, "rollouts-state");
                ?? IsEmpty = list2.isEmpty();
                try {
                    if (IsEmpty != 0) {
                        C1640.m3454(fileM5037, "Rollout state is empty for session: " + str4);
                        return;
                    }
                    try {
                        String strM3450 = C1640.m3450(list2);
                        bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileM5037), C1640.f5482));
                        try {
                            bufferedWriter.write(strM3450);
                            bufferedWriter.flush();
                            IsEmpty = bufferedWriter;
                        } catch (Exception e5) {
                            e = e5;
                            Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                            C1640.m3451(fileM5037);
                            IsEmpty = bufferedWriter;
                        }
                        break;
                    } catch (Exception e6) {
                        bufferedWriter = null;
                        e = e6;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                    AbstractC2133.m4138(IsEmpty, "Failed to close rollouts state file.");
                    return;
                } catch (Throwable th6) {
                    th = th6;
                    r1 = IsEmpty;
                }
                AbstractC2133.m4138(r1, "Failed to close rollouts state file.");
                throw th;
        }
    }

    public /* synthetic */ RunnableC3679(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f12291 = i;
        this.f12290 = obj;
        this.f12288 = obj2;
        this.f12289 = obj3;
        this.f12287 = obj4;
    }
}
