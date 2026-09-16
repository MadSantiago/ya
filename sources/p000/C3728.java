package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: renamed from: ۦٌؕؑؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3728 extends AbstractC3658 {
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C1046) {
            return super.contains((C1046) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C1046) {
            return super.indexOf((C1046) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C1046) {
            return super.lastIndexOf((C1046) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof C1046) {
            return super.remove((C1046) obj);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥُ */
    public final C5395 m6574(C2351 c2351) {
        if (isEmpty()) {
            return new C5395();
        }
        if (isEmpty()) {
            C1078.m2276("list is empty");
            return null;
        }
        DexKitBridge dexKitBridge = (DexKitBridge) ((C1046) get(0)).f15337;
        c2351.f7797 = this;
        dexKitBridge.getClass();
        byte[] bArrM8228 = c2351.m8228();
        ReentrantReadWriteLock.ReadLock lock = dexKitBridge.f366.readLock();
        lock.lock();
        try {
            long j = dexKitBridge.f367;
            if (j == 0) {
                throw new IllegalStateException("DexKitBridge is not valid");
            }
            byte[] bArrM158 = DexKitBridge.m158(j, bArrM8228);
            lock.unlock();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArrM158);
            C0035 c0035 = new C0035();
            byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
            c0035.m4028(byteBufferWrap.position() + byteBufferWrap.getInt(byteBufferWrap.position()), byteBufferWrap);
            C5395 c5395 = new C5395();
            int iM4031 = c0035.m4031(4);
            int iM4030 = iM4031 != 0 ? c0035.m4030(iM4031) : 0;
            for (int i = 0; i < iM4030; i++) {
                C0035 c0036 = new C0035();
                int iM4032 = c0035.m4031(4);
                if (iM4032 != 0) {
                    c0036.m4028(c0035.m4032((i * 4) + c0035.m4029(iM4032)), c0035.f6878);
                } else {
                    c0036 = null;
                }
                c5395.add(AbstractC4009.m7157(dexKitBridge, c0036));
            }
            if (c5395.size() > 1) {
                AbstractC3872.m6902(c5395, new C1206(11));
            }
            return c5395;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }
}
