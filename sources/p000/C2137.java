package p000;

import com.tencent.mmkv.MMKV;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.luckypray.dexkit.DexKitBridge;
import ru.bluecat.yandexmapspatcher.R;
import ru.bluecat.yandexmapspatcher.search.EnvironmentInitializer;

/* JADX INFO: renamed from: ۥۘؑٔٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2137 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C2137 f7014;

    /* JADX INFO: renamed from: ۥۣ */
    public ConcurrentHashMap f7015;

    static {
        C2137 c2137 = new C2137();
        c2137.f7015 = new ConcurrentHashMap();
        f7014 = c2137;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static void m4170(long j) {
        MMKV mmkvM166 = EnvironmentInitializer.m166();
        mmkvM166.clearAll();
        for (Map.Entry entry : f7014.f7015.entrySet()) {
            mmkvM166.m156((String) entry.getKey(), (String) entry.getValue());
        }
        MMKV mmkvM165 = EnvironmentInitializer.m165();
        String string = new C4441(new long[]{701894821460819032L, -1210091646549406682L, 2496961152617257326L}).toString();
        if (mmkvM165.m150(string)) {
            mmkvM165.m155(string);
        }
        mmkvM165.trim();
        mmkvM165.m152(C5787.f19064, string);
        ArrayList arrayList = C2503.f8322;
        EnumC3573.f11842.getClass();
        int i = EnumC3573.f11845;
        EnumC1245.f4289.getClass();
        C2503.m4654(AbstractC4009.m7184(R.string.finish_log_info2, Integer.valueOf(i + EnumC1245.f4288)));
        C4036 c4036 = C5805.f19128;
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        EnumC3021 enumC3021 = EnumC3021.MILLISECONDS;
        long jM7170 = AbstractC4009.m7170(jCurrentTimeMillis, enumC3021);
        EnumC3021 enumC3022 = EnumC3021.MINUTES;
        long jM9621 = C5805.m9621(jM7170, enumC3022);
        long jM9616 = C5805.m9616(jM7170, C5805.m9618(AbstractC4009.m7170(jM9621, enumC3022)));
        EnumC3021 enumC3023 = EnumC3021.SECONDS;
        long jM9622 = C5805.m9621(jM9616, enumC3023);
        long jM9617 = C5805.m9616(jM9616, C5805.m9618(AbstractC4009.m7170(jM9622, enumC3023)));
        String str = jM9622 + " сек. " + (((((int) jM9617) & 1) != 1 || C5805.m9615(jM9617)) ? C5805.m9621(jM9617, enumC3021) : jM9617 >> 1) + " мс.";
        if (jM9621 != 0) {
            str = jM9621 + " мин. " + str;
        }
        C2503.m4654(AbstractC4009.m7184(R.string.finish_log_info3, str));
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m4171(DexKitBridge dexKitBridge) {
        int i;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C4681 c4681 = EnumC4388.f14460;
        c4681.getClass();
        int i2 = 0;
        C0084 c0084 = new C0084(0, c4681);
        while (c0084.hasNext()) {
            linkedHashSet.add(((EnumC4388) c0084.next()).f14464);
        }
        C5292 c5292 = new C5292();
        c5292.f17429 = new ArrayList(linkedHashSet);
        byte[] bArrM8228 = c5292.m8228();
        ReentrantReadWriteLock.ReadLock lock = dexKitBridge.f366.readLock();
        lock.lock();
        try {
            long j = dexKitBridge.f367;
            if (j == 0) {
                throw new IllegalStateException("DexKitBridge is not valid");
            }
            byte[] bArrM157 = DexKitBridge.m157(j, bArrM8228);
            lock.unlock();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrM157);
            if (C4452.f14674 == null) {
                C4452.f14674 = new C4452(3);
            }
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            int iPosition = byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position());
            int i3 = iPosition - byteBufferWrap.getInt(iPosition);
            short s = byteBufferWrap.getShort(i3);
            HashMap map = new HashMap();
            short s2 = 4;
            short s3 = 4 < s ? byteBufferWrap.getShort(i3 + 4) : (short) 0;
            if (s3 != 0) {
                int i4 = s3 + iPosition;
                i = byteBufferWrap.getInt(byteBufferWrap.getInt(i4) + i4);
            } else {
                i = 0;
            }
            int i5 = 0;
            while (i5 < i) {
                C0035 c0035 = new C0035();
                int i6 = s2 < s ? byteBufferWrap.getShort(i3 + 4) : i2;
                if (i6 != 0) {
                    int i7 = i6 + iPosition;
                    int i8 = (i5 * 4) + byteBufferWrap.getInt(i7) + i7 + s2;
                    c0035.m4028(byteBufferWrap.getInt(i8) + i8, byteBufferWrap);
                } else {
                    c0035 = null;
                }
                int iM4031 = c0035.m4031(s2);
                String strM4033 = iM4031 != 0 ? c0035.m4033(iM4031 + c0035.f6879) : null;
                C5395 c5395 = new C5395();
                int i9 = 6;
                int iM4032 = c0035.m4031(6);
                int iM4030 = iM4032 != 0 ? c0035.m4030(iM4032) : i2;
                while (i2 < iM4030) {
                    C0035 c0036 = new C0035();
                    int iM4033 = c0035.m4031(i9);
                    if (iM4033 != 0) {
                        c0036.m4028(c0035.m4032((i2 * 4) + c0035.m4029(iM4033)), c0035.f6878);
                    } else {
                        c0036 = null;
                    }
                    c5395.add(AbstractC4009.m7157(dexKitBridge, c0036));
                    i2++;
                    i9 = 6;
                }
                if (c5395.size() > 1) {
                    AbstractC3872.m6902(c5395, new C1206(9));
                }
                map.put(strM4033, c5395);
                i5++;
                i2 = 0;
                s2 = 4;
            }
            for (Map.Entry entry : map.entrySet()) {
                C3570 c3570 = (C3570) ((C5395) entry.getValue()).m6536();
                if (c3570 != null) {
                    this.f7015.put(entry.getKey(), c3570.f11821);
                }
            }
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m4172(DexKitBridge dexKitBridge) {
        C4681 c4681 = EnumC1245.f4291;
        c4681.getClass();
        C0084 c0084 = new C0084(0, c4681);
        while (c0084.hasNext()) {
            EnumC1245 enumC1245 = (EnumC1245) c0084.next();
            ArrayList arrayList = new ArrayList();
            C5395 c5395M6574 = dexKitBridge.m160(enumC1245.mo2632()).m6574(enumC1245.mo2631());
            if (c5395M6574.isEmpty()) {
                c5395M6574 = null;
            }
            if (c5395M6574 != null) {
                Iterator it = c5395M6574.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C3570) it.next()).f11821);
                }
            }
            if (!arrayList.isEmpty()) {
                this.f7015.put(enumC1245.f4298, AbstractC0973.m2056(arrayList, new C4441(new long[]{9088219900682418134L, 4893370841313488855L}).toString(), null, null, null, 62));
            }
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m4173(DexKitBridge dexKitBridge) {
        C3570 c3570;
        C4681 c4681 = EnumC3573.f11884;
        c4681.getClass();
        C0084 c0084 = new C0084(0, c4681);
        while (c0084.hasNext()) {
            EnumC3573 enumC3573 = (EnumC3573) c0084.next();
            if (!enumC3573.f11894 && (c3570 = (C3570) dexKitBridge.m160(enumC3573.mo303()).m6574(enumC3573.mo302()).m6536()) != null) {
                this.f7015.put(enumC3573.f11896, c3570.f11821);
            }
        }
    }
}
